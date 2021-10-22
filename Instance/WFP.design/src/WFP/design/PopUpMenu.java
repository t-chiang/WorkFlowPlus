package WFP.design;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class PopUpMenu extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        //HandlerUtil.getActiveWorkbenchWindow(event).close();
    	System.out.println("Hello World");
        return null;
    }

}