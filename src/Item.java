public class Item {
    /**
     * 唯一标识
     */
    private String id;
    /**
     * 图片路径
     */
    private String imagePath;

    public Item(String id, String imagePath) {
        this.id = id;
        this.imagePath = imagePath;
    }

    public Item() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
