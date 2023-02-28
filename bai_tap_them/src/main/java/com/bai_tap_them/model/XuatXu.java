package com.bai_tap_them.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class XuatXu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 45,unique = true)
    private String name;
    @OneToMany(mappedBy = "xuatXu")
    private Set<Heo> heoSet;

    public XuatXu() {
    }

    public XuatXu(int id, String name, Set<Heo> heoSet) {
        this.id = id;
        this.name = name;
        this.heoSet = heoSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Heo> getHeoSet() {
        return heoSet;
    }

    public void setHeoSet(Set<Heo> heoSet) {
        this.heoSet = heoSet;
    }
}
