public abstract class FileSystemUnit {
    protected Folder parentDirectory;
    protected String name;
    protected long createdAt;
    protected long lastUpdatedAt;

    public FileSystemUnit(Folder parentDirectory, String name) {
        this.parentDirectory = parentDirectory;
        this.name = name;
        this.createdAt = System.currentTimeMillis();
        this.lastUpdatedAt = System.currentTimeMillis();;
    }

    public abstract int  size();

    public boolean delete(){
        if(parentDirectory == null){
            return false;
        }
        return true;
    }

    public String getName(){
        return name;
    }



    public void rename(String name){
        this.name = name;
    }


}
