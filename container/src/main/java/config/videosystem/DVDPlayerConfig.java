package config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.videosystem.Avengers;
import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {
	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	// 주입하기1 : Bean 생성 메소드 직접 호출 : 생성자 주입
	//@Bean
	public DVDPlayer dvdPlayer() {
		return new DVDPlayer(avengers());
	}
	
	// 주입하기2 : 파라미터로 bean 전달하기 : 생성자 주입
	//@Bean
	public DVDPlayer dvdPlayer02(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
	
	// 주입하기3 : 파라미터로 bean 전달하기 : setter 주입
	@Bean
	public DVDPlayer dvdPlayer03(DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setDvd(dvd);
		return dvdPlayer;
	}
	
	// 주입하기4 : 같은 타입이 생성된 경우
	@Bean(name="Player04")
	public DVDPlayer dvdPlayer04(DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setDvd(dvd);
		return dvdPlayer;
	}
	
}
