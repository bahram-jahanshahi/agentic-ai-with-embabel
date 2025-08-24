package se.bahram.ai.agentic_ai_with_embabel;

import com.embabel.agent.config.annotation.EnableAgentShell;
import com.embabel.agent.config.annotation.EnableAgents;
import com.embabel.agent.config.annotation.LoggingThemes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableAgentShell
@EnableConfigurationProperties
@EnableAgents(loggingTheme = LoggingThemes.SEVERANCE)
public class AgenticAiWithEmbabelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgenticAiWithEmbabelApplication.class, args);
	}

}
