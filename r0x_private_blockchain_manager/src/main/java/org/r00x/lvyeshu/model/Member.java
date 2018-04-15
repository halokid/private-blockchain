package org.r00x.lvyeshu.model;

import org.r00x.lvyeshu.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  联盟的成员
 */

@Entity
@Table(name = "member")
public class Member extends BaseEntity {
  // 节点id， 一个公司可有多个， 相当于多个服务器节点
  private String app_id;

  // 成员名
  private String name;

  // ip
  private String ip;

  // 属于哪个联盟链， 可以有多个联盟
  private String group_id;

  @Override
  public String toString() {
    return "BaseEntity{" +
            "app_id = " + app_id +
            ", name = " + name +
            ", ip = " + ip +
            ", group_id = " + group_id +
            '}';
  }

  public String getAppId() {  return app_id; }

  public void setAppId(String app_id) { this.app_id = app_id; }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getIp() {
    return ip;
  }

  public void setGroup_id(String group_id) {
    this.group_id = group_id;
  }

  public String getGroup_id() {
    return group_id;
  }




}




