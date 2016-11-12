import javax.persistence.*;


/**
 * Created by Виталий on 12.11.2016.
 */

@Entity
@Table(name= "Books")
public class Books {

    @Id
    @Column(name= "S_n", length=6)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int S_n;
    @Id
    @Column(name= "Author", length=45)
    private String Author;

    @Id
    @Column(name = "Title", length=200)
    private String Title;

    @Column (name = "Publisher", length=45)
    private String Publisher;

    @Column (name = "Description", length=1000)
    private String Description;

    @Column (name = "Image")
    private String Image;


    public int getS_n() {
        return S_n;
    }

    public void setS_n(int s_n) {
        S_n = s_n;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }


    public static void main (String args[]){

        System.out.println("Вовсяком случае компилируется... ! ");
    }

}
