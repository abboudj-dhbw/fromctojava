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
        BufferedWriter bw = new BufferedWriter(fw);
    }

    @Override
    public void handle(SensorReading reading)
    {
        bw.write(reading.getSeq() + "," + reading.getStationId()+ "," + reading.getTemperatureC() + "," + reading.getHumidityPct()); 
    }

    @Override
    public void close()
    {   
        if (this.writer != Null) {this.writer.close();}
    }
}