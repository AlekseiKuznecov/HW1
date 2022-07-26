import java.net.URL;
import java.util.List;

public class Root {
    private String url;
    private String href;
    private String name;
    private String slug;
    private List<People> people;

    public String getName(){return name; }

    public List<People> getPeople() {
        return people;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public void setHref(String href){
        this.href = href;
    }
    public void setSlug(String slug){
        this.slug = slug;
    }
    public void setPeople(List<People> people){
        this.people = people;
    }


    @Override
    public String toString() {
        return "Root{" +
                "url='" + url + '\'' +
                ", href='" + href + '\'' +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", people=" + people +
                '}';
    }
}
