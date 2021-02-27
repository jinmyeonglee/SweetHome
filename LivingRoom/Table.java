class Table{
    String name; // NOT PRIVATE BECUASE I AM LAZY TO MAKE A GETTER AND SETTER
    String color;
    int price; 
    Double width; 
    Double depth; 
    Double height;    
    String refUrl; 
    String opinion;

    public Table(){
        this.name = ""; 
        this.color = ""; 
        this.price = 0; 
        this.width = 0.0; 
        this.depth = 0.0; 
        this.height = 0.0;
        this.refUrl = ""; 
        this.opinion = ""; 
    } 

    public String toString(){
        return "Name : " + this.name + "\n" + 
        "Color : " + this.color + "\n" + 
        "Price : " + this.price + "\n" + 
        "Width : " + this.width + "\n" + 
        "Depth : " + this.depth + "\n" + 
        "Height : " + this.height + "\n" + 
        "Reference Url :" + this.refUrl + "\n" +
        "Opinion : " + this.opinion + "\n";
    }
}