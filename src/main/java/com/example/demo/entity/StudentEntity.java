package.com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class StudentEntity{

private Long id;
private String name;
private String email;
private float cgpa;
private String dept;

public void setId(Long id){
    this.id=id;
}
public int getId(){
    return id;
}
public void setName(String name){
    this.name=name;
}
public int getName(){
    return name;
}
public void setEmail(String email){
    this.email=email;
}
public int getEmail(){
    return email;
}
public void setcgpa(Long id){
    this.id=id;
}
public int getId(){
    return id;
}
public void setId(Long id){
    this.id=id;
}
public int getId(){
    return id;
}

}