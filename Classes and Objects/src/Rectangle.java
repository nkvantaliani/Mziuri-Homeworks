public class Rectangle {
    float length;
    float width;

    Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    float perimeter(){
        return 2*(length+width);
    }
    float area(){
        return length * width;
    }
    float diagonal(){
        return (float) Math.sqrt(length * length + width * width);
    }
    boolean isSquare(){
        if(width == length){
            return true;
        }
        return false;
    }
}
