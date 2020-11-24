package com.example.pes;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
@SpringBootApplication(scanBasePackages = "com.example")
//使用注解驱动缓存机制
@EnableCaching
@MapperScan(basePackages = "com.example", annotationClass = Mapper.class)
public class PesApplication extends WebSecurityConfigurerAdapter {

	// 注入数据源
		@Autowired
		private DataSource dataSource = null;

		@Autowired
		private UserDetailsService UserDetailsService = null;
		
	public static void main(String[] args) {
		SpringApplication.run(PesApplication.class, args);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		
	    http
	        // 访问/admin下的请求需要管理员权限
	        .authorizeRequests().antMatchers("/admin/**")
	            .access("hasRole('ADMIN')")
	        // 通过签名后可以访问任何请求
//	        .and().authorizeRequests()
//	            .antMatchers("/**").permitAll()
	        // 设置登录页和默认的跳转路径
	        .and().formLogin().loginPage("/login/page")
	            .defaultSuccessUrl("/admin/welcome1")
//	        // 登出页面和默认跳转路径
	        .and().logout().logoutUrl("/logout/page")
	            .logoutSuccessUrl("/welcome");
	}

}

