import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CsvWriter implements SensorDataHandler
{
    private BufferedWriter writer;

    public CsvWriter(String filename) throws IOException
    {   
        try
        { 
            Writer fw = new FileWriter(filename);
            this.writer = new BufferedWriter(fw);
        }
        catch (IOException e) 
        {
            e.printStackTrace();
            throw e; // Fehler weitergeben, damit der Aufrufer damit umgehen kann
        }
    }

    @Override
    public void handle(SensorReading reading)
    {
        try 
        {
            this.writer.write(reading.getSeq() + "," + reading.getStationId()+ "," + reading.getTemperatureC() + "," + reading.getHumidityPct());
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close()
    {   
        if (this.writer != null) {
            try 
            {
                this.writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
}