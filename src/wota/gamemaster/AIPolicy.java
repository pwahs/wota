package wota.gamemaster;

import java.security.AllPermission;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;

/**
 * Controls the permitted actions of a dynamically loaded AI.
 */
public class AIPolicy extends Policy {

	public PermissionCollection getPermissions(CodeSource codeSource) {
		Permissions p = new Permissions();
		p.add(new AllPermission());
		return p;
	}

	public void refresh() {
	}
}
