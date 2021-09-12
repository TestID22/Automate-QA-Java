import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedMap;
import java.util.concurrent.ForkJoinPool;

public class SerchFilesInFolders {
    public static void main(String[] args) {

        List <File> test = new ArrayList<>();
        searchAllfiles(new File("c:\\"), test);
        System.out.println(test.size());
        for (File file : test){
            System.out.println(file.getName());
        }
    }

    public static void searchAllfiles(File rootFile, List<File> fileList){
        if(rootFile.isDirectory()){
            File[] directoryFiles = rootFile.listFiles();
            if(directoryFiles != null){
                for(File file : directoryFiles){
                    if(file.isDirectory()){
                        System.out.println("Searchig in" + file.getAbsolutePath());
                        searchAllfiles(file, fileList);
                    }else{
                        if(file.getName().toLowerCase().endsWith(".exe")){
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}
