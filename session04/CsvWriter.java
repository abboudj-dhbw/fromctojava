import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CsvWriter implements SensorDataHandler
{
    private BufferedWriter writer;

    public CsvWriter(String filename) throws IOException
    {   
        Writer fw = new FileWriter(filename);
        writer = new BufferedWriter(fw);
    }

    @Override
    public void handle(SensorReading reading)
    {
        if (reading == null)
        {
            System.err.println("CsvWriter: null-Reading empfangen — übersprungen");
            return;
        }

        try 
        {
            writer.write(reading.getSeq() + "," + reading.getStationId()+ "," + reading.getTemperatureC() + "," + reading.getHumidityPct());
            writer.newLine();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close()
    {   
        if (writer != null) {
            try 
            {
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
}