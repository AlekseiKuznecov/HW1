public class People {
    private String url;
    private String href;
    private String name;
    private String slug;

    public People(String url, String href, String name, String slug) {
        this.url = url;
        this.href = href;
        this.name = name;
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public String getHref() {
        return href;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    @Override
    public String toString() {
        return "People{" +
                "url='" + url + '\'' +
                ", href='" + href + '\'' +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                '}';
    }
}
