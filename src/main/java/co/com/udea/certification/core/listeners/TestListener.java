package co.com.udea.certification.core.listeners;

import co.com.udea.certification.core.pages.basePage.BasePage;
import org.testng.*;

import java.io.File;
import java.io.IOException;

public class TestListener implements ITestListener, IExecutionListener{

    @Override
    public void onExecutionStart() {
        String reportsDirPath = System.getProperty("user.dir") + "/reports";
        File reportsDir = new File(reportsDirPath);

        try {
            if (reportsDir.exists()) {
                org.apache.commons.io.FileUtils.deleteDirectory(reportsDir);
                System.out.println("✅ Carpeta 'reports' eliminada completamente.");
            } else {
                System.out.println("ℹ️ La carpeta 'reports' no existe.");
            }
        } catch (IOException e) {
            System.err.println("❌ Error al eliminar 'reports': " + e.getMessage());
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        BasePage.closeDriver();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        BasePage.closeDriver();
    }
}
