package com.douzone.container.videosystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.vedio.mixing.VideoSystemConfig;
import config.videosystem.mixing.DVDConfig;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes= {DVDConfig.class, VideoSystemConfig.class})
@ContextConfiguration(classes= VideoSystemConfig.class)
public class DVDPlayerMixingConfigTest02 {

	@Autowired
	DVDPlayer player;
	
	@Test
	public void testPlayerNotNUll() {
		assertNotNull(player);
	}
}

