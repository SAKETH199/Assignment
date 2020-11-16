package com.pojo;

import java.util.StringTokenizer;

public class IPValidation {
	public static int ipValidator(String ipAddress) {
		StringTokenizer t = new StringTokenizer(ipAddress, ".");
		int a = Integer.parseInt(t.nextToken());
		int b = Integer.parseInt(t.nextToken());
		int c = Integer.parseInt(t.nextToken());
		int d = Integer.parseInt(t.nextToken());
		if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255) && (c >= 0 && c <= 255) && (d >= 0 && d <= 255)) {
			return 1;
		} else {
			return 2;
		}
	}

}
