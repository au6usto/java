
package model;

import java.util.Date;



/**
 * UTN-FRT ISI
 * @author au6usto
 */
public class ToDo {
    private int id;
    private String todo;
    private String importance;
    private Date createdAt;
    private Date updatedAt;

    public ToDo(int id, String todo, String importance) {
        this.id =  id;
        this.todo = todo;
        this.importance = importance;
        this.createdAt =  new Date();
        this.updatedAt =  new Date();
    }

    public ToDo(int id, String todo) {
        this.id =  id;
        this.todo = todo;
        this.importance = "1";
        this.createdAt =  new Date();
        this.updatedAt =  new Date();
    }

    public ToDo(int id, String todo, String importance, Date createdAt, Date updatedAt) {
        this.id =  id;
        this.todo = todo;
        this.importance = importance;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
        this.updatedAt =  new Date();
    }

    public String getImportance() {
        return importance;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setImportance(String importance) {
        this.importance = importance;
        this.updatedAt =  new Date();
    }
}
