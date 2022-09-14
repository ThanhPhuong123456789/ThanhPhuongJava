package ThanhPhuong.output1.models;

import java.util.List;

public class BookDTO {
    public Integer id;
    private String publisher;
    private String yearOfPublish;
    private String bookCode;
    private String name;
    private int libraryId;
    private List<Integer> authorId;
    private List<String> priceId;
    private List<String> publisherId;

    public int getLibraryId() {
        return libraryId;
    }


    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public List<Integer> getAuthorId() {
        return authorId;
    }

    public List<String> getPriceId()
    {

        return priceId;
    }

    public void setAuthorId(List<Integer> authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "publisher='" + publisher + '\'' +
                ", yearOfPublish='" + yearOfPublish + '\'' +
                ", bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", libraryId=" + libraryId +
                ", authorId=" + authorId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookDTO(int id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(String yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookDTO(String publisher, String yearOfPublish, String bookCode, String name, int libraryId, List<Integer> authorId) {
        this.publisher = publisher;
        this.yearOfPublish = yearOfPublish;
        this.bookCode = bookCode;
        this.name = name;
        this.libraryId = libraryId;
        this.authorId = authorId;
    }

    public BookDTO(List<String> priceId) {
        this.priceId = priceId;
    }

    public void setPriceId(List<String> priceId) {
        this.priceId = priceId;
    }
}
