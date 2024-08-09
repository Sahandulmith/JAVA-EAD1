package pos.system.restaurant.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Category {
    private Long id;
    private String category;
    private String description;
    private byte[] photo;
    
    public Category(){
        
    }
    
    public Category(String category){
        this.category =category;
    }
    
    public Category(Long id, String category){
        this.id =id;
        this.category =category;
    }
}
