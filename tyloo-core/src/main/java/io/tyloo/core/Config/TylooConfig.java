

package io.tyloo.core.Config;

import io.tyloo.core.serializer.KryoPoolSerializer;
import lombok.Data;

/*
 *
 * @Author:Zh1Cheung 945503088@qq.com
 * @Date: 18:48 2020/2/10
 *
 */


@Data
public class TylooConfig {

    /**
     * ���л���־.
     * {@linkplain KryoPoolSerializer}
     */
    private String serializer = "kryo";

    /**
     * scheduledPool Thread size.
     */
    private int scheduledThreadMax = Runtime.getRuntime().availableProcessors() << 1;

    /**
     * disruptor��bufferSize
     */
    private int bufferSize = 4096 * 2 * 2;

    /**
     * distuptor�����߳�����
     */
    private int consumerThreads = Runtime.getRuntime().availableProcessors() << 1;

    /**
     * �첽ִ��confirm��cancel�̳߳��̵߳Ĵ�С
     */
    private int asyncThreads = Runtime.getRuntime().availableProcessors() << 1;

    /**
     * ���𷽵�ʱ�򣬰Ѵ���������Ϊtrue�����뷽Ϊfalse��
     */
    private Boolean started = true;


}
