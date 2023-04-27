package manytomany;

import java.util.Date;
import java.util.List;

public class Commande {
    private long id;
    private Date date;
    private double totalTTC;
    private List<Article> articles;
    public void addArticle(Article article){
        articles.add(article);
    }
}
