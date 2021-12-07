package entities;

import java.util.Objects;

public class Os {

    private int id;
    private String number;
    private int user_id;
    private String date;
    private Double amount;
    private int client_id;
    private int ps_id;
    private String descricao;

    public Os() {
    }

    public Os(String number, int user_id, String date, Double amount, int client_id, int ps_id, String descricao) {
        this.number = number;
        this.user_id = user_id;
        this.date = date;
        this.amount = amount;
        this.client_id = client_id;
        this.ps_id = ps_id;
        this.descricao = descricao;
    }

    public Os(int id, String number, int user_id, String date, Double amount, int client_id, int ps_id, String descricao) {
        this.id = id;
        this.number = number;
        this.user_id = user_id;
        this.date = date;
        this.amount = amount;
        this.client_id = client_id;
        this.ps_id = ps_id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getPs_id() {
        return ps_id;
    }

    public void setPs_id(int ps_id) {
        this.ps_id = ps_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.number);
        hash = 97 * hash + this.user_id;
        hash = 97 * hash + Objects.hashCode(this.date);
        hash = 97 * hash + Objects.hashCode(this.amount);
        hash = 97 * hash + this.client_id;
        hash = 97 * hash + this.ps_id;
        hash = 97 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Os other = (Os) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.user_id != other.user_id) {
            return false;
        }
        if (this.client_id != other.client_id) {
            return false;
        }
        if (this.ps_id != other.ps_id) {
            return false;
        }
        if (!Objects.equals(this.number, other.number)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.amount, other.amount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Os{" + "id=" + id + ", number=" + number + ", user_id=" + user_id + ", date=" + date + ", amount=" + amount + ", client_id=" + client_id + ", ps_id=" + ps_id + ", descricao=" + descricao + '}';
    }
}