package com.learn.training.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.client.LinkDiscoverer;
import org.springframework.hateoas.client.LinkDiscoverers;
import org.springframework.hateoas.mediatype.collectionjson.CollectionJsonLinkDiscoverer;
import org.springframework.plugin.core.SimplePluginRegistry;

@SpringBootApplication
public class UserRegistrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationServiceApplication.class, args);
	}
	
	@Bean
	public LinkDiscoverers discovers() 
	{
		 List<LinkDiscoverer> plugins = new ArrayList<>(); plugins.add(new
		 CollectionJsonLinkDiscoverer()); return new
		 LinkDiscoverers(SimplePluginRegistry.create(plugins));
	}


}
