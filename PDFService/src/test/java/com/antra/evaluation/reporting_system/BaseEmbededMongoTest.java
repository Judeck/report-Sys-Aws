import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodProcess;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BaseEmbededMongoTest.class)
@ActiveProfiles("test")
public class BaseEmbededMongoTest {

    private static final Logger logger = LoggerFactory.getLogger(BaseEmbededMongoTest.class);
    protected static final MongodStarter starter = MongodStarter.getDefaultInstance();
    protected static MongodExecutable _mongodExe;
    protected static MongodProcess _mongod;

    // 确保与配置一致
    protected static final String host = "127.0.0.1";
    protected static final int port = 9999;

    @BeforeClass
    public static void setUp() throws Exception {
        _mongodExe = starter.prepare(new MongodConfigBuilder().version(Version.Main.PRODUCTION)
                .net(new Net(host, port, Network.localhostIsIPv6())).build());
        _mongod = _mongodExe.start();

        //logger.info("mongod started on {}:{}", host, port);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        _mongod.stop();
        _mongodExe.stop();
    }
}