package entities;

import application.Application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;

    private String title;

    private String content;

    private Integer likes;

    private List<coment> coments = new ArrayList<>();

    public post(){}

    public post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getDate() {
        return moment;
    }

    public void setDate(Date date) {
        this.moment = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<coment> getComents() {
        return coments;
    }

   /* public void setComents(List<coment> coments) {
        this.coments = coments;
    }*/

    public void addComent(coment coment){
        coments.add(coment);
    }
    public void removeComent(coment coment){
        coments.remove(coment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // append = acrescentar no final
        sb.append(title + "\n");
        sb.append(likes + " Likes - "+ sdf.format(moment)+"\n");
        sb.append(content+ "\n");
        sb.append("Coments: \n");
        for (coment c : coments){
            sb.append(c.getText());
            sb.append("\n");
        }
        return sb.toString();
    }
}
