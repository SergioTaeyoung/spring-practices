package config.vedio.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import config.videosystem.mixing.DVDConfig;
import config.videosystem.mixing.DVDPlayerConfig;

/**
 * 
 * Explicit Configuration : Java Configuration
 * 
 *  JavaConfig <----- {JavaConfig1, JavaConfig2, .... }
 *  			import
 *  JavaConfig1 + JavaConfig2
 * 
 */
@Configuration
@Import({DVDConfig.class, DVDPlayerConfig.class})
public class VideoSystemConfig {

}
