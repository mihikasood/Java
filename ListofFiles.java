import java.io.File;
import java.lang.String;
import java.text.NumberFormat;
import java.util.Locale;

public class ListofFiles{
	
public static void ListDir (File file)
    {
        
        File[] InFile;
		String CurrentDir;
        CurrentDir = file.getName();
        int Numfiles;
		
		CurrentDir = file.getName();
        if(file.isDirectory())
        {
            System.out.println(CurrentDir);
            InFile = file.listFiles();
            for(File iterate : InFile)
            {
                if(iterate.isDirectory())
                {
                    System.out.print(iterate.list().length + " ");
                    Numfiles = CountFiles(iterate);
                    System.out.print(Numfiles + " ");
                    ListDir(iterate);
                }
                else
                {
                    System.out.println("0 0 " +iterate.getName());
                }
            }
        }

    }

    public static int CountFiles(File file)
    {
        int count =0;
        File[] filesnum;
        filesnum = file.listFiles();
        for (File iterate : filesnum)
        {
            if (iterate.isDirectory() == false)
            {
                count +=1;
            }
            else
            {
                CountFiles(iterate);
            }
        }
        return count;
    }
	
	public static void Extension(File file)
	{
		int jpg=0,png=0,gif=0,mp4=0,mp3=0,exe=0,psd=0,html=0,xml=0;
		double jpgbytes=0,pngbytes=0,gifbytes=0,mp4bytes=0,mp3bytes=0,exebytes=0,psdbytes=0,htmlbytes=0,xmlbytes=0;
		
		File[] count=file.listFiles();
		
		
        for (File iterate : count) {
			double jpgbytes1=0,pngbytes1=0,gifbytes1=0,mp4bytes1=0,mp3bytes1=0,exebytes1=0,psdbytes1=0,htmlbytes1=0,xmlbytes1=0;
			
            if (file.isFile() &&(file.getName().endsWith(".jpg") || file.getName().endsWith(".JPG"))) {
				jpg++;
				jpgbytes1=file.length();
				jpgbytes=jpgbytes+jpgbytes1;
				
                    }
			else if (file.isFile() &&(file.getName().endsWith(".png") || file.getName().endsWith(".PNG"))) {
				png++;
				pngbytes1=file.length();
				pngbytes=pngbytes+pngbytes1;
            }
			else if (file.isFile() &&(file.getName().endsWith(".gif") || file.getName().endsWith(".GIF"))) {
				gif++;
				gifbytes1=file.length();
				gifbytes=gifbytes+gifbytes1;
            }
			else if (file.isFile() &&(file.getName().endsWith(".mp4") || file.getName().endsWith(".MP4"))) {
				mp4++;
				mp4bytes1=file.length();
				mp4bytes=mp4bytes+mp4bytes1;
            }
			else if (file.isFile() &&(file.getName().endsWith(".mp3") || file.getName().endsWith(".MP3"))) {
				mp3++;
				mp3bytes1=file.length();
				mp3bytes=mp3bytes+mp3bytes1;
            }
			else if (file.isFile() &&(file.getName().endsWith(".exe") || file.getName().endsWith(".EXE"))) {
				exe++;
				exebytes1=file.length();
				exebytes=exebytes+exebytes1;
            }
			else if (file.isFile() &&(file.getName().endsWith(".psd") || file.getName().endsWith(".PSD"))) {
				psd++;
				psdbytes1=file.length();
				psdbytes=psdbytes+psdbytes1;
            }
			else if (file.isFile() &&(file.getName().endsWith(".html") || file.getName().endsWith(".HTML"))) {
				html++;
				htmlbytes1=file.length();
				htmlbytes=htmlbytes+htmlbytes1;
            }
			else if (file.isFile() &&(file.getName().endsWith(".xml") || file.getName().endsWith(".XML"))) {
				xml++;
				xmlbytes1=file.length();
				xmlbytes=xmlbytes+xmlbytes1;
            }
            
    }
	        System.out.println("Number of jpg: " + jpg);
			System.out.println("Number of png: " + png);
			System.out.println("Number of gif: " + gif);
			System.out.println("Number of mp4: " + mp4);
			System.out.println("Number of mp3: " + mp3);
			System.out.println("Number of exe: " + exe);
			System.out.println("Number of psd: " + psd);
			System.out.println("Number of html: " + html);
			System.out.println("Number of xml: " + xml);
			
			System.out.print("Size of jpg: ");
		System.out.println(NumberFormat.getNumberInstance(Locale.US).format(jpg));
		System.out.print("Size of png: ");
		System.out.println(NumberFormat.getNumberInstance(Locale.US).format(png));
		System.out.print("Size of gif: ");
		System.out.println(NumberFormat.getNumberInstance(Locale.US).format(gif));
		System.out.print("Size of mp4: ");
		System.out.println(NumberFormat.getNumberInstance(Locale.US).format(mp4));
		System.out.print("Size of mp3: ");
		System.out.println(NumberFormat.getNumberInstance(Locale.US).format(mp3));
		System.out.print("Size of exe: ");
		System.out.println(NumberFormat.getNumberInstance(Locale.US).format(exe));
		System.out.print("Size of psd: ");
		System.out.println(NumberFormat.getNumberInstance(Locale.US).format(psd));
		System.out.print("Size of html: ");
		System.out.println(NumberFormat.getNumberInstance(Locale.US).format(html));
		System.out.print("Size of xml: ");
		System.out.println(NumberFormat.getNumberInstance(Locale.US).format(xml));
			
			

	}			
				
				
				
				
				
				
			
			
		
		
	

    public static void main(String args[])
    {
        File file = new File("C:/Users/mihik/code");
        ListDir(file);
		Extension(file);
		long time = System.currentTimeMillis();
		System.out.print("The program took: ");
		System.out.print(NumberFormat.getNumberInstance(Locale.US).format(time));
		System.out.print(" milliseconds ");
		
    }

}

