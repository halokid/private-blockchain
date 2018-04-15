package org.r00x.lvyeshu.model.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long id;

  private Date create_time;

  private Date update_time;

  public void setCreate_time(Date create_time) {
    this.create_time = create_time;
  }

  public Date getCreate_time() {
    return create_time;
  }

  public void setUpdate_time(Date update_time) {
    this.update_time = update_time;
  }

  public Date getUpdate_time() {
    return update_time;
  }

  public Long getId() { return id; }      // 假如 id 是  private, 发现没， 没用 this.id

  public void setId(Long id) { this.id = id; }      // 这里却用了 this.id

  @Override
  public String toString() {
    return "BaseEntity{" +
            "id = " + id +
            ", create_time = " + create_time +
            ", update_time = " + update_time +
            '}';
  }
}


