/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamuswan.sample.springrdb.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 *
 * @author Thanawat Muangsawang
 */
@Entity
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @Column(name = "first_name", unique = false)
    private String firstName;

    @Column(name = "last_name", unique = false)
    private String lastName;

    @Column(name = "nickname", length = 150)
    private String nickname;

    @Column(nullable = true)
    private int age;

    @Column(name = "create_date", nullable = false)
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    @Setter(AccessLevel.NONE)
    private Date createDate;

    @Column(name = "update_date", nullable = false)
    @Temporal(TemporalType.DATE)
    @UpdateTimestamp
    @Setter(AccessLevel.NONE)
    private Date updateDate;

}
