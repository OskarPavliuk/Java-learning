package Stack_implementation;

public class URLElement {
    private String url;
    private URLElement next;

    public URLElement(String url, URLElement next) {
        this.url = url;
        this.next = next;
    }


    public String getUrl() {
        return url;
    }

    public URLElement getNext() {
        return next;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNext(URLElement next) {
        this.next = next;
    }
}
