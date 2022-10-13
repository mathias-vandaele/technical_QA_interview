package com.capitoleconsulting.technicalqainterview.testengine.core;

import com.capitoleconsulting.technicalqainterview.testengine.models.Configurator;
import lombok.Getter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEngine {

    private static final Logger logger = LogManager.getLogger(TestEngine.class);
    @Getter private static final TestEngine INSTANCE = new TestEngine();
    @Getter private Configurator configurator;

    public static void start(Configurator configurator){
        logger.info("Starting ...");
        INSTANCE.configurator = configurator;
        INSTANCE._runTests();
    }

    private void _runTests() {
        String[] asArgs = new String[] { configurator.getFeaturePath(),
                "--glue", configurator.getGluedClassPath(),
                "--plugin",
                "junit:" + configurator.getReportPath() + File.separator + "Report_" + new SimpleDateFormat("yyyyMMddHHmm'.xml'").format(new Date())};
        io.cucumber.core.cli.Main.main(asArgs);

    }
}
