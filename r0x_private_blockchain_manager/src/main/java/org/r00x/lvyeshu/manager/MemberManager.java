package org.r00x.lvyeshu.manager;

import org.r00x.lvyeshu.bean.MemberData;
import org.r00x.lvyeshu.model.Member;
import org.r00x.lvyeshu.repository.MemberRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;


@Component
public class MemberManager {
  // @Resource 表示是在 spring框架内拿资源， 怎么拿是 spring做的事，有这个注解就表明框架会帮你自动拿就是了
  // fixme:  所有的  @Resource 资源都是通过 java.lang.reflect， 反射机制 （spring框架都是用的这个机制） 去拿取的
  @Resource
  private MemberRepository memberRepository;


  // 查询成员的 group_id

  /**
   *  这里直接用了 repository 里面的类去查询数据库了哦 ~~ 擦泥煤， 所以说概念见鬼去吧
   */
  public String findGroupId(String member_name) {
    Member member = memberRepository.findFirstByName(member_name);
    if (member != null) {
      return member.getGroup_id();
    }
    return null;
  }


  public MemberData memberData(String name, String app_id, String ip) {
    MemberData memberData = new MemberData();
    Member member = memberRepository.findFirstByAppId(app_id);

    if (member == null) {
      memberData.setCode(-1);
      memberData.setMessage("客户不存在");
    }
    else if (!member.getName().equals(name)) {
      //name 错误
      memberData.setCode(-1);
      memberData.setMessage("name错误");
    }
    else if (!member.getIp().equals(ip)) {
      memberData.setCode(-1);
      memberData.setMessage("ip错误");
    }

    memberData.setCode(0);      //success
    String group_id = findGroupId(name);

    List<Member> members = memberRepository.findByGroupId(group_id);
    memberData.setMembers(members);
    return memberData;
  }

}





