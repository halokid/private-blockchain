package org.r00x.lvyeshu.repository;

import org.r00x.lvyeshu.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *  这个类返回的都是一些接口方法， 类的作用就是定义接口方法的， 这是一个 interface 接口类
 */


public interface MemberRepository extends JpaRepository<Member, Long>{

  // <Member, Long> 表示映射给  MemberController 控制器的持久长连接
  List<Member> findByName(String name);

  // 查询同一个联盟里面， 除自己以外的其他的所有节点
  List<Member> findByGroupIdAndAppIdNot(String name, String id);

  // 查询某个节点
  Member findFirstByAppId(String app_id);

  // 查询一个联盟的所有节点
  List<Member> findByGroupId(String group_id);

  // 根据机构名查询
  Member findFirstByName(String name);

}



