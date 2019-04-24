package ee.itcollege.taltechcars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private User user;
    private List<BeautyService> beautyServicesTaken;
    private Date date;
    private int totalPrice;

    public Contract(User user, List<BeautyService> beautyServicesTaken, Date date, int totalPrice) {
        this.user = user;
        this.beautyServicesTaken = beautyServicesTaken;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<BeautyService> getBeautyServicesTaken() {
        return beautyServicesTaken;
    }

    public void setBeautyServicesTaken(List<BeautyService> beautyServicesTaken) {
        this.beautyServicesTaken = beautyServicesTaken;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
