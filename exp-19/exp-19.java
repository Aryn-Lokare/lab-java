import java.io.*;

class exp19 {
    public static void main(String[] args) {
        String fileName = "exp19-output.txt";
        try {
            // Byte stream
            try (FileOutputStream out = new FileOutputStream("bytes.txt")) {
                out.write("Byte stream example".getBytes());
            }
            try (FileInputStream in = new FileInputStream("bytes.txt")) {
                System.out.println("Byte stream: " + new String(in.readAllBytes()));
            }

            // Character stream
            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write("Character stream example");
            }
            try (FileReader reader = new FileReader(fileName)) {
                int ch;
                System.out.print("Character stream: ");
                while ((ch = reader.read()) != -1) System.out.print((char) ch);
                System.out.println();
            }

            // Buffered stream
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("buffered.txt"))) {
                writer.write("Buffered stream example");
            }
            try (BufferedReader reader = new BufferedReader(new FileReader("buffered.txt"))) {
                System.out.println("Buffered stream: " + reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
