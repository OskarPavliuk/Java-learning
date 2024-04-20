package Stack_implementation;

public class Stack_example {

    private final int MAX_STACK_SIZE = 10;
    private URLElement topElement = null;
    private int currentHeight = 0;

    public void push(String url) {
        if (currentHeight == MAX_STACK_SIZE) {
            throw new IndexOutOfBoundsException("Full");
        } else {
            URLElement eUrlElement = new URLElement(url, topElement);
            topElement = eUrlElement;
            eUrlElement.setNext(null);
            currentHeight++;
        }
    }

    public String pop() {
        if (currentHeight == 0) {
            throw new IllegalArgumentException();
        } else {
            String urlString = topElement.getUrl();
            topElement = topElement.getNext();
            currentHeight--;
            return urlString;
        }
    }

    public String peek(){
        if(currentHeight == 0){
            throw new IllegalArgumentException();
        } else {
            return topElement.getUrl();
        }
    }




}
