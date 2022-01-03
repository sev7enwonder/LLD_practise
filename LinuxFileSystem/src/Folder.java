import java.util.ArrayList;
import java.util.List;

/**
 * Folder should have List of Files and folders
 *
 * */


public class Folder extends FileSystemUnit{

    private List<FileSystemUnit> listOfSubFilesAndFolders;

    public Folder(Folder parentDirectory, String name) {
        super(parentDirectory, name);
        this.listOfSubFilesAndFolders = new ArrayList<>();
    }

    public void addSubFileAndFolder(FileSystemUnit fsu){
        listOfSubFilesAndFolders.add(fsu);
    }

    public void deleteFileAndFolder(FileSystemUnit fsu){
        listOfSubFilesAndFolders.remove(fsu);
    }

    @Override
    public int size() {
        int size = 0;
        for(FileSystemUnit fsu : listOfSubFilesAndFolders){
            size += fsu.size();
        }
        return size;
    }

    public int numberOfSubFileAndFolder(){
        int totalNumberofSubFolderAndFiles = 0;
        for(FileSystemUnit fsu:listOfSubFilesAndFolders){
            if(fsu instanceof Folder){
                totalNumberofSubFolderAndFiles ++;
                totalNumberofSubFolderAndFiles += ((Folder) fsu).numberOfSubFileAndFolder();
            }else{
                totalNumberofSubFolderAndFiles++;
            }
        }
        return totalNumberofSubFolderAndFiles;
    }
}
