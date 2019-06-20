package com.navy.core.config.security;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.navy.mapper.sys.SysUser;

/**
 * 用户验证实体
 * @author Administrator
 */
public class SecurityUser implements UserDetails{
	
	private static final long serialVersionUID = -3232509335415902394L;
	
	private SysUser sysUser;
	
	private List<String> roles;
	
	public SecurityUser() {}
	
	public SecurityUser(SysUser sysUser, List<String> roles) {
		this.sysUser = sysUser;
		this.roles = roles;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		if(roles == null) {
			return null;
		}
		return roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getPassword() {
		return this.sysUser.getPassword();
	}

	@Override
	public String getUsername() {
		return this.sysUser.getUsername();
	}
}
