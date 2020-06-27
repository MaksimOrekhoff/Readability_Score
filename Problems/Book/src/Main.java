class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;
    public String getTitle() {
        return title;
    }
    public void setTitle(String t) {
        this.title = t;
    }
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
    public void setYearOfPublishing(int year) {
        this.yearOfPublishing = year;
    }
    public String[] getAuthors() {
        return authors;
    }
    public void setAuthors(String[] auth) {
        this.authors = auth;
    }
}