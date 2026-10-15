
package modelo;

public class Customers {
   private int id;
   private String full_name;
   private String addresss;
   private String telephone;
   private String email;
   private String create;
   private String update;

    public Customers() {
    }

    public Customers(int id, String full_name, String addresss, String telephone, String email, String create, String update) {
        this.id = id;
        this.full_name = full_name;
        this.addresss = addresss;
        this.telephone = telephone;
        this.email = email;
        this.create = create;
        this.update = update;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }
   
   
   
}
