package org.spring.security.learn.chapter2.security;

import org.spring.security.learn.chapter2.entity.MyUser;
import org.spring.security.learn.chapter2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        MyUser user = userRepository.findByUsername(name);
        if(user == null){
            throw new UsernameNotFoundException(name);
        }
        String password = user.getPassword();
        String encode = new BCryptPasswordEncoder().encode(password);
        Collection<GrantedAuthority> authList = getAuthorities();

        return new User(name, encode, true, true, true, true,authList);
    }

    private Collection<GrantedAuthority> getAuthorities(){
        List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
        //这里添加的角色，实际项目中应该根据用户信息从数据库中获取，这里为了简单起见直接赋值。
        authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        //也可以继续添加其它角色
        return authList;
    }

}
