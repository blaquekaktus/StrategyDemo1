import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVExporter implements IExportable{

    @Override
    public void export(List<Article> articleList) {
        try {
            FileWriter fileWriter = new FileWriter("CSVExport.csv");
            fileWriter.write("Number,Name,Manufacturer");
            for(Article article : articleList)
            {
                String line = article.getNumber() + "," + article.getName() + "," + article.getManufacturer();
                fileWriter.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
