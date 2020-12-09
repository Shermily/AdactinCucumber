package com.adactin.helper;

import java.io.IOException;

public class FileReaderManager {
//Here we keep private as method, to stop creating object
	private FileReaderManager() {
	}

	public static  FileReaderManager getInstance() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}

	public ConfigurationReader getCrInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
}
