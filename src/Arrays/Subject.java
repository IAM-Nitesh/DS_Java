package Arrays;

public class Subject implements Cloneable{
    int id ;

    Subject( int i){
        this.id = i;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                '}';
    }

    @Override
    public Subject clone(){
        try{
            return (Subject)super.clone();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
