import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("/home/biel36288/vscode/Project/Product/src/products.csv"))) {

            String line = reader.readLine();
            while (line != null) {

                String[] fields = line.split(",");

                String name = fields[0];
                double value = Double.parseDouble(fields[1]);
                int amount = Integer.parseInt(fields[2]);

                products.add(new Product(name, value, amount));

                line = reader.readLine();
            }

            products.stream().forEach(p -> {
                System.out.println("Dados dos produtos: "); System.out.println("Name: "+p.getName());
                System.out.println("Value: "+p.getValue()); System.out.println("Amount: "+p.getAmount());
                System.out.println("TOTAL: "+p.total()+"\n\n");
            });

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a leitura dos dados :( ");
            e.printStackTrace();
        }
    }
}
