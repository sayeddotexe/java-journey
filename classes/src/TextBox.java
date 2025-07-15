// A simple TextBox class that holds and manages text content
public class TextBox {

    // Instance variable to store the text content (default is an empty string)
    public String text = "";

    // Method to set the text of the TextBox
    public void setText(String text){
        this.text = text; // 'this.text' refers to the instance variable
    }

    // Method to clear the text content (sets it to an empty string)
    public void clear(){
        this.text = "";
    }
}
