public class File extends FileSystemUnit{

    private String content;
    private int size;
    public File(Folder parentDirectory, String name) {
        super(parentDirectory, name);
        this.content = "";
        size = 0;
    }

    public String getContent() {
        return content;
    }

    @Override
    public int size() {
        return this.size;
    }

    public void updateContentAndSize(String content,int size){
        content = content;
        size = size;
    }

}
